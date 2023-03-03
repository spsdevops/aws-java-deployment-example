package com.divit.springboot.application.util;

import java.util.List;
import java.util.Set;

import com.divit.springboot.application.model.Candidate;

public final class CandidatesUtil {

	private CandidatesUtil() {
	}

	/**
	 * 
	 * Method to help us get dummy data
	 * 
	 * @return list of candidates
	 */
	public static List<Candidate> getCandidates() {
		var candidateList = List.of(
				new Candidate("Sam 1", 2, Set.of("java", "c#", "c++", "golang")),
				new Candidate("Sam 2", 1, Set.of("javascript", "c++")),
				new Candidate("Sam 3", 4, Set.of("java", "python")),
				new Candidate("Sam 4", 2, Set.of("ruby", "aws", "docker")),
				new Candidate("Sam 5", 3, Set.of("python", "Erlang", "docker")));

		return candidateList;
	}
}
