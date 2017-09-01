import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3};
		int[] nums2 = {1, 3};
		System.out.println(nums1.length);
		IntersectionTwoArray ob = new IntersectionTwoArray();
		System.out.println(Arrays.toString(ob.intersection(nums1, nums2)));
	}

}
