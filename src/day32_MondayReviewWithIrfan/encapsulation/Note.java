package day32_MondayReviewWithIrfan.encapsulation;

public class Note {
	/*In Encapsulation:
     * You make your variables private.
     * Create a no args Constructor to initialize objects. Declare variables in it.
       using this. method. You can also call the setMethod of the variables in
       the Constructor. setMethod(variable set in the method) 
                => e.g => setAccountNumber(AccountNumber);
     * You generate Getter and setters to set and return values out of them.
* Generate a ToString method to display all your result => Compile Time Polymorphism.
     * (.................Continued in next Class.............*/
    
/*Java Inheritance:
     * Here, you extend this subclass(PNC) to the SuperClass(Bank) {extends Bank}
     * You put the import superclass code on top.
     * Subclass "PNC" extends from SuperClass "Bank".
     * This is so you can use the attributes and methods from the SuperClass in 
       all the other classes created afterwards by creating an Object of this subclass
       in the other new Classes with the Main Method.
     * We use the Super keyword to set a value defined only to the Subclass using 
       the subclass's constructor.
       For e.g = PNC is a location so we will use 
                   public PNC(){
                               super.setLocation("PNC address")
                               }
       to give it a default value to use in the Main method later
     * Create(Add) more new Variables specific to this Class. Generate toString
       method to display it.
     * We also add a ToString method here to "Override" the values of the  method
       ToString method in the SuperClass(Bank) => Runtime Polymorphism
     * Generate a ToString Method concatenating with super.ToString => This will also
     * display the values of ToString from the SuperClass(Bank) as well.
     * You can also add(Create) new variables and update them to the methods of the
     * SuperClass using super.Method(newVariable) in the Constructor of this class.
     * For e.g = PNC gets a new Account bonus Deposit so we will use 
                 double newAccountBonus = 500;
                   public PNC(){
                               super.setDeposit(bonus)
                               }*/
    
    
/*Inheritance pt.2:
     * You can also directly set up a value for a variable from the super class
     * in the Constructor using super keyword:
     * public CapitalOne(String bankAccNum, String Name, String location){
     *     super(bankAccNum, Name, "123 Main St")
     *                     }
     */
/*Superclass & Subclass Test:
         * 
         * To do Overriding:
           
         * SuperClass name = new SubClass();
           e.g => Bank pnc = new PNC();
         * Then you write the various methods in the SuperClass with the subclass:
                   name.Method(value);
                   e.g => pnc.setAccNum("12344321");
         * After that, you print the ToString method to display the complete Output
         * If you have an extra No Args Constructor along with the Parameterized one
              (e.g like in PNC, only then you can create an Object with no Arguments required
         * Otherwise, if its a parametirized Constructor, you need to enter the values 
              of the constructor declared in the particular subclass.
            * If a subclass variable is called, it will not work because the subclass is
              attributed to the SuperClass in the Object created above.
            * If you want to access an attribute from a subClass, make sure it is also 
              available in the SuperClass! 
            * In the end, you create an ArrayList of superclass to display the subclass 
            * elements together.
     * e,g => List<SuperClass> list = new ArrayList<>(Arrays.asList(obj1,obj2,obj3));
          * for (SuperClass name : list) {
          *         sysout(list.ToString();
          *         }  */
        

}
