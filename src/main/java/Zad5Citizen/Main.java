package Zad5Citizen;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Citizen[] citizens=new Citizen[5];
        citizens[0]=new Soldier("Rambo");
        citizens[1]=new Peasant("Drzymała");
        citizens[2]=new Peasant("Janko");
        citizens[3]=new Townsman("Jaś Fasola");
        citizens[4]=new King("Sobieski");

        Town myTown=new Town(citizens);
        System.out.println(String.format("Ilość osób które mogą głosować: %d",howManyCanVote(citizens)));
        System.out.println(String.format("Imiona osob które mogą głosować: %s",myTown.whoCanVote().toString()));
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

