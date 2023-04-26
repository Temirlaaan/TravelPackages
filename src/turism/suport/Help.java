package turism.suport;

import turism.action.*;
import java.util.Scanner;
import turism.TourPackage.Date;

public class Help {
    String name, choice;
    public Help(String name){
        this.name = name;
        System.out.println("Здравствуйте , спасибо что пользыетесь нашим тур агенством " + name);
    }
    DateAction dateAction = new DateAction();
    Print print = new Print();
    Date sortDate;
    public Date helpsOrder(Date date){
        Scanner cin = new Scanner(System.in);
        while(true) {
            System.out.println("Сверху вы видите список туристических пакетов \nПожалуйста выберите соритровку по одному из данных параметров \"ColDays\" или \"Price\"");
            do{
                choice = cin.nextLine();
            }while(!choice.equals("Price") && !choice.equals("ColDays"));
            switch (choice) {
                case "Price":
                    System.out.println("Товары отсортированны по заданному диапазону ");
                    sortDate = dateAction.sortDatePrice(date);
                    break;
                case "ColDays":
                    System.out.println("Товары отсортированны по заданному диапазону ");
                    sortDate = dateAction.sortDateColDays(date);
                    break;
            }
            return sortDate;
        }

    }

    public void Choiсe(Date date ){
        int answer , refdays ,sum;
        String reform ,reffood ,reftransport;
        Scanner cin = new Scanner(System.in);
        System.out.println("Выберите один из пакетов путёвок от 1-го до "+date.getSize());

        do{
            answer = cin.nextInt();
        }while(answer<0 && answer>(date.getSize()+1));
        System.out.println(".\n..\n...");
        System.out.println("Желаете ли вы изменить количество дней , питание и транспорт ?");
        System.out.println("\"Yes\" \"No\"");

        do{
            reform = cin.nextLine();
        }while(!reform.equals("Yes") && !reform.equals("No"));
        if(reform.equals("Yes")){
            //colDays
            System.out.println("Введите количество дней ");
            System.out.println("Цена будет автоматически менятся в зависимости от того сколько вы выберите");
            do{
                refdays = cin.nextInt();
            }while(refdays<0 );
            double a ;
            a = (refdays/date.getDateFromIndex(answer-1).getColDays())*date.getDateFromIndex(answer-1).getPrice();
            sum=(int)a;
            date.getDateFromIndex(answer-1).setColDays(refdays);
            date.getDateFromIndex(answer-1).setPrice(sum);
            //Food
            System.out.println("Цена питания \nNormal pack 10000 тг\nGood pack 20000 тг\nVery Good pack 30000 тг");
            System.out.println("Введите питание \n\"Normal\" \"Good\" \"Very Good\"");
            do{
                reffood = cin.nextLine();
            }while(!reffood.equals("Normal") && !reffood.equals("Good")&&!reffood.equals("Very Good"));
            switch (reffood) {
                case "Normal":
                    System.out.println("Пип Пуп\nДанные введены");
                    date.getDateFromIndex(answer-1).setFood(reffood);
                    date.getDateFromIndex(answer-1).setPrice(date.getDateFromIndex(answer-1).getPrice()+10000);
                    break;
                case "Good":
                    System.out.println("Пип Пуп\nДанные введены");
                    date.getDateFromIndex(answer-1).setFood(reffood);
                    date.getDateFromIndex(answer-1).setPrice(date.getDateFromIndex(answer-1).getPrice()+20000);
                    break;
                case "Very Good":
                    System.out.println("Пип Пуп\nДанные введены");
                    date.getDateFromIndex(answer-1).setFood(reffood);
                    date.getDateFromIndex(answer-1).setPrice(date.getDateFromIndex(answer-1).getPrice()+30000);
                    break;
            }

            //Transport
            System.out.println("Цена проезда на транспорте \nBus 10000 тг\nCar 20000 тг\nPlane 30000 тг");
            System.out.println("Введите транспорт \n\"Car\" \"Plane\" \"Bus\"");
            do{
                reftransport = cin.nextLine();
            }while(!reftransport.equals("Car") && !reftransport.equals("Plane")&&!reftransport.equals("Bus"));
            switch (reftransport) {
                case "Bus":
                    System.out.println("Пип Пуп\nДанные введены");
                    date.getDateFromIndex(answer-1).setTransport(reftransport);
                    date.getDateFromIndex(answer-1).setPrice(date.getDateFromIndex(answer-1).getPrice()+10000);
                    break;
                case "Car":
                    System.out.println("Пип Пуп\nДанные введены");
                    date.getDateFromIndex(answer-1).setTransport(reftransport);
                    date.getDateFromIndex(answer-1).setPrice(date.getDateFromIndex(answer-1).getPrice()+20000);
                    break;
                case "Plane":
                    System.out.println("Пип Пуп\nДанные введены");
                    date.getDateFromIndex(answer-1).setTransport(reftransport);
                    date.getDateFromIndex(answer-1).setPrice(date.getDateFromIndex(answer-1).getPrice()+30000);
                    break;
            }
        }
        else if(reform.equals("No")) {
            return;
        }

    }
}
