package LS2Assignment;

public class Program5 {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			int[][] Matrix = new int[4][4];
			String str = "_____";
			for(int i=0; i<4;i++){
				for(int j=0; j<4;j++){
					Matrix[i][j]= RandomNumbers.getRandomInt(1, 99);
					if(i%2!=0)  {
						System.out.printf("%+15d",Matrix[i][j]);
					}
					else System.out.printf("%15d",Matrix[i][j]);
				}
				System.out.printf("%n");			
				if(i%2!=0){				
					
					System.out.printf("%16s%15s%15s%15s",str,str,str,str);
					System.out.printf("%n%n");
					
				}
			}
		}
	}

