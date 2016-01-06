package kr.projectd.match;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MatchList<M extends DefaultMatch> {
	private Map<String, M> matchMap;
	
	public MatchList() {
		matchMap = new HashMap<String, M>();
	}
	
	public boolean add(M match) {
		String key = match.getName();
		if (matchMap.containsKey(key)) {
			return false;
		}
		matchMap.put(key, match);
		return true;
	}
	
	public boolean remove(String key) {
		DefaultMatch prevM;
		prevM = matchMap.remove(key);
		return (prevM == null) ? false : true;
	}
	
	public long totalMatchPoint() {
		long pointSum = 0;
		M match;
		Set<String> keySet = matchMap.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			match = matchMap.get(it);
			pointSum += match.getMatchPoint();
		}
		return pointSum;
	}
}
