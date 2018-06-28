package Algorithm;

public class SequentialSearch2 {

	public static void main(String[] args)
	{
		int arr[] = { 11, 13, 25, 27, 36, 45, 65 };

		// 원하는 숫자가 들어있는지 확인
		int wantFind = 47;

		for (int i = 0; i < arr.length; i++)
		{
			if (wantFind > arr[i])
				break;

			if (wantFind == arr[i])
			{
				System.out.println(i + " 번째에 동일한 숫자 " + wantFind + "이(가) 존재합니다.");
				break;
			}

			else if (wantFind != arr[i] && i == arr.length - 1);
			{
				System.out.println("해당 숫자가 존재하지 않습니다.");
			}

		}
	}
}
