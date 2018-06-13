package com.infoshareacademy;

public class Il {

        public int kolumny;
        public int wiersze;
        public int wartosc;
        int[][] tab;



        public Il(int kolumny, int wiersze) {
            this.kolumny=kolumny;
            this.wiersze=wiersze;
        }
        public int[][]getTab(){
            this.tab=new int[this.kolumny][this.wiersze];
            for(int i=0;i<this.kolumny;i++)
                for(int j=0;j<this.wiersze;j++){
                    this.tab[i][j]=wartosc;
                }
            return this.tab;
        }
        public void prin(){
            System.out.println("Tablica ");
            for(int i=0;i<this.tab.length;i++){
                for(int j=0;j<tab[i].length;j++){
                    System.out.print(tab[i][j]);
                }
                System.out.println();
            }


        }

    }

