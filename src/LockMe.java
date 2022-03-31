

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LockMe {
	public static void main(String[] args) throws IOException {
		int operation=0;
		System.out.println("Enter 1 for creating of file and 2 for deleting of file 3 for displaying of file and 4 for searching of file  ");
		Scanner sc=new Scanner(System.in);
		operation=sc.nextInt();
		while(true) {
			switch(operation) {
			case 1:
				String path="C:\\SimpliLearn\\";
				Scanner s= new Scanner(System.in);
				ArrayList<String> al=new ArrayList<>();
				System.out.println("enter the file name to create");
				String filename=sc.next();
				String finalname=path+filename;
				System.out.println(finalname);
//	create a file
				File f= new File(finalname);
				boolean b=f.createNewFile();
				if(b!=true) {
					System.out.println("the file not created");
				}
				else {
					al.add(filename);
					System.out.println("file created");
				}

				System.out.println("the collection of files is "+ al);

			case 2:
				String path1="C:\\SimpliLearn\\";
				Scanner s2= new Scanner(System.in);
				System.out.println("enter the file name to delete");
				String filename2=sc.next();
				String finalname2=path1+filename2;
				File f2=new File(finalname2);
				f2.delete();
				System.out.println("File deleted");
			
			case 3:
				String path3="C:\\SimpliLearn\\";
				File f3=new File(path3);
				Scanner s3=new Scanner(System.in);
				System.out.println("enter the file name to display");
				File filename3[]=f3.listFiles();
				for(File ff:filename3) {
					System.out.println(ff.getName());
				}
				
			case 4:
				String path4="C:\\SimpliLearn\\";
				File f4=new File(path4);
				Scanner s4=new Scanner(System.in);
				System.out.println("enter the file name to search");
				String filesearchname=s4.next();
				File filename4[]=f4.listFiles();
				int flag=0;
				for(File ff:filename4) {
					if(ff.getName().equals(filesearchname)) {
						flag=1;
						break;
					}
					else {
						flag=0;
					}
				}

				if(flag==1) {
					System.out.println("found the file");
				}
				else {
					System.out.println("file is not found");
				}
			case 5:System.exit(0);
			break;
			}
		}
	}
}