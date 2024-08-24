public class TestingErrors {

	public static void main(String[] args) {
		int[] numArr = {1, 3, 5, 7, 9};
		for (int k = numArr.length - 1; k >= 0; k--)
		{

			int temp = numArr[k];

			numArr[k] = numArr[numArr.length - k - 1];

			numArr[numArr.length - k - 1] = temp;

		}
		for (int x: numArr) {
			System.out.println(x);
		}
	}

}
