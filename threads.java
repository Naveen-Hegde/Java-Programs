import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Sort extends Thread{
    int low;
    int high;
	Sort(int low,int high){
		this.low = low;
		this.high = high;
	}
	public void run()
	{
		try {
			File fis = new File("C:\\Users\\HP\\Documents\\Numbers.txt");
			BufferedReader br = new BufferedReader(new FileReader(fis));
			File fos = new File("C:\\Users\\HP\\Documents\\resultfile.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(fos));
			String str="";
			Integer[] arr = new Integer[high-low+1];
			int i=0,count = -1;
			while(((str=br.readLine())!=null)) {
				count++;
				if(count>=low && count<=high)
				{
					arr[i++] = Integer.valueOf(str);
				}
			}
			
			Arrays.sort(arr);
			
			for(int k=0;k<arr.length;k++)
			{
				String str1 = String.valueOf(arr[k]);
				bw.write(str1);
				bw.newLine();
			}
			
			br.close();
			bw.close();
		}catch(FileNotFoundException e1) {
			e1.printStackTrace();
		}catch(IOException e2) {
			e2.printStackTrace();
		}

	}
}

class SortAll extends Thread{
	public void run() {
		try {
			String str;
			File fis = new File("C:\\Users\\HP\\Documents\\Numbers.txt");
			BufferedReader br = new BufferedReader(new FileReader(fis));
			File fos = new File("C:\\Users\\HP\\Document\\SortedIntegers.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(fos));
			while(((str=br.readLine())!=null)) {
				bw.write(str);
				bw.newLine();
			}			
		}catch(FileNotFoundException e1) {
			e1.printStackTrace();
		}catch(IOException e2) {
			e2.printStackTrace();
		}
	}
}
public class threads {

	public static void main(String[] args) throws Exception{

		File f = new File("C:\\Users\\HP\\Document\\Numbers.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of integers to add to file");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int k=0;k<arr.length;k++)
		{
			String str = String.valueOf(arr[k]);
			bw.write(str);
			bw.newLine();
		}
		
		Sort T1 = new Sort(0,(n/3)-1);
		Sort T2 = new Sort(n/3,(2*n/3)-1);
		Sort T3 = new Sort(2*n/3,n-1);
		SortAll T4 = new SortAll();
		
		T1.start();
		T1.join();
		
		T2.start();	
		T2.join();
		
		T3.start();
		T3.join(); 
		
		T4.start();
		
	}
}
