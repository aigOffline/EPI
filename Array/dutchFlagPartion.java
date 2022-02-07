
//Aigerim Madakimova
public enum Color {red, white, blue}
public static void dutchFlagPartion (int pivotIndex, List<Color> A){
	Color pivot = A.get(pivotIndex);
	int smaller =0;
	for(int i = 0; i < A.size(); ++i){
		if(A.get(i).ordinal() < pivot.ordinal()){
			Collections.swap(A, smaller++, i);
		}
	}
	int larger = A.size()-1;
	for(int i = A.size()-1; i>0; --i){
		if(A.get(i).ordinal() > pivot.ordinal()){
			Collections.swap(A, larger--, i);
		}
	}
}


1.https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/
