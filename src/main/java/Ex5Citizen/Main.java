package Ex5Citizen;

public class Main {
    public static void main(String[] args) {

        Citizen[] citizens=new Citizen[5];
        citizens[0]=new Soldier("Rambo");
        citizens[1]=new Peasant("Drzymała");
        citizens[2]=new Peasant("Janko");
        citizens[3]=new Townsman("Mr  Bean");
        citizens[4]=new King("Sobieski");

        Town myTown=new Town(citizens);
        System.out.println(String.format("Number of people can vote: %d",howManyCanVote(citizens)));
        System.out.println(String.format("Names of people can vote: %s",myTown.whoCanVote().toString()));
    }

    public static int howManyCanVote(Citizen[] citizens){
         int counter=0;

         for (Citizen citizen:citizens){
             if(citizen.canVote()){
                 counter++;
             }
         }
        return counter;
    }
    }

/*OUTPUT
Number of people can vote: 2
Names of people can vote: [Rambo, Mr  Bean]

Process finished with exit code 0
 */