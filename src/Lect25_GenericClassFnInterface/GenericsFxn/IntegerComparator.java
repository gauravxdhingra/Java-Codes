package Lect25_GenericClassFnInterface.GenericsFxn;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1 ;
	}

}
