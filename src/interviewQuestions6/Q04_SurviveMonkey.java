package interviewQuestions6;

public class Q04_SurviveMonkey {
    	/*
		There is a lonely monkey in the island
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island
		Create following variables and find how many days
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;
		*/
        public static void main(String[] args) {
            int numberOfBananas =165;
            int survivalDays = 0;
            boolean monkeyAlive = true;

            do {// yasiyorken
                System.out.println(" maymun gunde 4 muz yer ");
                numberOfBananas-=4; // toplam muz sayisindan her seferinde 4 muz eksilir
                survivalDays++;
                if (numberOfBananas<4){
                    monkeyAlive=false;
                    System.out.println("bugun "+ survivalDays + " . gun,  muz kalmadi maymun allaha kavustu ");
                }else System.out.println("bugun " +survivalDays + ". gun, maymun halen yasiyor ");

            }while (monkeyAlive); // oluyken
            System.out.println("toplam Maymunun yasadigi gun sayisi : "+ survivalDays );
        }




}

