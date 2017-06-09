package org.hello.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JobFeedParser {
	/**
	 * Predefined column names
	 */
	private final static Set<String> COLS = new HashSet<String>(Arrays.asList("box_name", "etl_box", "job_name", "machine"));
	/**
	 * delimiter for entries
	 */
	private static final String ENTRY_DELIMETER = ";";
	private static final String DELIMETER = ":";

	/**
	 * Assuming that the entry name and entry value doesn't contains any
	 * delimiter characters
	 * 
	 * @param sourceString
	 * @return source key:value pairs in map
	 */
	public static Map<String, String> parse(final String sourceString) {
		Map<String, String> sourceMap = new HashMap<String, String>();
		if (sourceString == null || sourceString.isEmpty()) {
			System.out.println("source feed not defined");
		}else{
			String[] pairs = sourceString.split(ENTRY_DELIMETER);
			for (String pair : pairs) {
				String[] entry = pair.split(DELIMETER);
				sourceMap.put(entry[0], entry[1]);
			}
			if(!COLS.equals(sourceMap.keySet())){
				System.out.println("source feed is malformed");
			}
		}
		return sourceMap;
	}

	
	
	public static void main(String[] args) {
		System.out.println(parse("box_name:etl_box;owner:anna;job_name:elt_job;machine:vm1;"));
	}

}
