package chapter01.First;

import java.util.Enumeration;
import java.util.Vector;

import static java.lang.System.out;

public class Test1 {
    public static void main(String[] args) {
        Movie newm=new Movie("书本1",Movie.NEW_RELEASE);
        Movie newm1=new Movie("书本2",Movie.REGULAR);

        Rental rental=new Rental(newm,3);
        Rental rental1=new Rental(newm1,2);

        Customer customer=new Customer("tapas");
        customer.addRental(rental);
        customer.addRental(rental1);

        out.print(customer.statement());

    }

}
  class  Movie{
    public  static  final int CHILDRENS=2;
    public  static  final  int REGULAR=0;
    public  static  final  int  NEW_RELEASE=1;

    private  String _title;
    private  int _pricecode;
    private  Price _price;

    public  Movie(String title,int pricecode)
    {
        _title=title;
        setPriceCode(pricecode);
    }
    public  int getPriceCode(){
        return  _price.getPriceCode();
    }

    public  void  setPriceCode(int arg){
        switch (arg){
            case REGULAR:
                _price=new RegularPrice();
                break;
            case CHILDRENS:
                _price=new ChildrenPrice();
                break;
            case NEW_RELEASE:
                _price=new NewReleasePrice();
                break;
        }
    }

    public  String getTitle(){
        return  _title;
    }

    public  double getCharge(int daysRented){
//       int thisAmount=0;
//       switch (this.getPriceCode()){
//           case  Movie.REGULAR:
//               thisAmount+=2;
//               if(daysRented>2){
//                   thisAmount+=(daysRented-2)*1.5;
//               }
//               break;
//           case  Movie.NEW_RELEASE:
//               thisAmount+=(daysRented)*3;
//               break;
//           case  Movie.CHILDRENS:
//               thisAmount+=1.5;
//               if(daysRented>3)
//                   thisAmount+=(daysRented-3)*1.5;
//               break;
//       }
//       return  thisAmount;
        return _price.getCharge(daysRented);
   }

}

  abstract class  Price{
    abstract  int getPriceCode();

    abstract  double getCharge(int daysRented);
//    public double getCharge(int daysRented)
//    {
//        int thisAmount=0;
//       switch (this.getPriceCode()){
//           case  Movie.REGULAR:
//               thisAmount+=2;
//               if(daysRented>2){
//                   thisAmount+=(daysRented-2)*1.5;
//               }
//               break;
//           case  Movie.NEW_RELEASE:
//               thisAmount+=(daysRented)*3;
//               break;
//           case  Movie.CHILDRENS:
//               thisAmount+=1.5;
//               if(daysRented>3)
//                   thisAmount+=(daysRented-3)*1.5;
//               break;
//       }
//       return  thisAmount;
//    }
  }
  class  ChildrenPrice extends Price{
    int getPriceCode(){
        return  Movie.CHILDRENS;
    }
    double getCharge(int daysRented){
        double result=1.5;
        if(daysRented>3)
            result+=(daysRented-3)*1.5;
        return  result;
    }
  }

  class  NewReleasePrice extends Price{
     int getPriceCode(){
         return  Movie.NEW_RELEASE;
     }
      double getCharge(int daysRented){
          double result=3*daysRented;
          return  result;
      }
  }
class  RegularPrice extends Price{
    int getPriceCode(){
        return  Movie.REGULAR;
    }

    double getCharge(int daysRented){
        double result =2;
        if(daysRented>2){
            result+=(daysRented-2)*1.5;
        }
        return  result;
    }
}

//租赁
class Rental{
    private Movie _movie;
    private  int _daysRented;

    public  Rental(Movie movie,int daysRented)
    {
        _movie=movie;
        _daysRented=daysRented;
    }
    public  int getDaysRented(){
        return  _daysRented;
    }

    public  Movie getMovie(){
        return  _movie;
    }

    public  double getCharge(){
//       int thisAmount=0;
//       switch (this.getMovie().getPriceCode()){
//           case  Movie.REGULAR:
//               thisAmount+=2;
//               if(this.getDaysRented()>2){
//                   thisAmount+=(this.getDaysRented()-2)*1.5;
//               }
//               break;
//           case  Movie.NEW_RELEASE:
//               thisAmount+=(this.getDaysRented())*3;
//               break;
//           case  Movie.CHILDRENS:
//               thisAmount+=1.5;
//               if(this.getDaysRented()>3)
//                   thisAmount+=(this.getDaysRented()-3)*1.5;
//               break;
//       }
//       return  thisAmount;
        return  _movie.getCharge(_daysRented);
   }

   public  int getFrequentRenterPoints(){
        int frequentRenterPoints=0;
       frequentRenterPoints++;
        if((this.getMovie().getPriceCode()==Movie.NEW_RELEASE)&&this.getDaysRented()>1)
             frequentRenterPoints++;
        return  frequentRenterPoints;
   }
}

class  Customer
{
    private  String _name;
    private Vector _rentals=new Vector();

    public Customer(String name)
    {
        _name=name;
    }

    public  void  addRental(Rental arg){
        _rentals.add(arg);
    }

    public  String getName(){
        return  _name;
    }

 /*   public  String statement(){
        double totalAmount=0;
        int frequentRenterPoints=0;
        Enumeration rentals=_rentals.elements();
        String result="Rental Record for "+getName()+"\n";
        while (rentals.hasMoreElements())
        {
            double thisAmount=0;
            Rental each=(Rental)rentals.nextElement();
            switch (each.getMovie().getPriceCode()){
                case  Movie.REGULAR:
                    thisAmount+=2;
                    if(each.getDaysRented()>2){
                        thisAmount+=(each.getDaysRented()-2)*1.5;
                    }
                    break;
                case  Movie.NEW_RELEASE:
                    thisAmount+=(each.getDaysRented())*3;
                    break;
                case  Movie.CHILDRENS:
                    thisAmount+=1.5;
                    if(each.getDaysRented()>3)
                        thisAmount+=(each.getDaysRented()-3)*1.5;
                    break;
            }
            frequentRenterPoints++;
            if((each.getMovie().getPriceCode()==Movie.NEW_RELEASE)&&each.getDaysRented()>1)
                frequentRenterPoints++;

            result+="\t"+each.getMovie().getTitle()+"\t"+String.valueOf(thisAmount)+"\n";
            totalAmount+=thisAmount;
        }
        result+="Amount owed is "+String.valueOf(totalAmount)+"\n";
        return  result;
    }*/
   public  String statement(){
    // double totalAmount=0;
     int frequentRenterPoints=0;
     Enumeration rentals=_rentals.elements();
     String result="Rental Record for "+getName()+"\n";
     while (rentals.hasMoreElements())
     {
         //double thisAmount=0;
         Rental each=(Rental)rentals.nextElement();
         //thisAmount=each.getCharge();
//         frequentRenterPoints++;
//         if((each.getMovie().getPriceCode()==Movie.NEW_RELEASE)&&each.getDaysRented()>1)
//             frequentRenterPoints++;
         frequentRenterPoints+=each.getFrequentRenterPoints();

         result+="\t"+each.getMovie().getTitle()+"\t"+String.valueOf(each.getCharge())+"\n";
        // totalAmount+=each.getCharge();
     }
     result+="Amount owed is "+String.valueOf(getTotalCharge())+"\n";
     return  result;
 }

 private  double getTotalCharge(){
     double totalAmount=0;
     Enumeration rentals=_rentals.elements();
     while (rentals.hasMoreElements())
     {
         Rental each=(Rental)rentals.nextElement();
         totalAmount+=each.getCharge();
      }
     return totalAmount;
 }

   /*private  int amountFor(Rental rental){
       int thisAmount=0;
       switch (rental.getMovie().getPriceCode()){
           case  Movie.REGULAR:
               thisAmount+=2;
               if(rental.getDaysRented()>2){
                   thisAmount+=(rental.getDaysRented()-2)*1.5;
               }
               break;
           case  Movie.NEW_RELEASE:
               thisAmount+=(rental.getDaysRented())*3;
               break;
           case  Movie.CHILDRENS:
               thisAmount+=1.5;
               if(rental.getDaysRented()>3)
                   thisAmount+=(rental.getDaysRented()-3)*1.5;
               break;
       }
       return  thisAmount;
   }*/
}
