public static void main(String[] args) {

	//declare variabiables
	float startBet;

	//make my dice 
	int roll1() {
    return (int)(6.0 * Math.random()) + 1;
}
    int roll2() {
    return (int)(6.0 * Math.random()) + 1;
}

	//Declare string variables 
	String stringstartBet;

	//Declare and initize our Scanner
	Scanner sc = new Scanner(System.in);


	//Get input from user
	System.out.println("Please enter starting bet: $");
	stringstartBet = sc.nextLine();

}