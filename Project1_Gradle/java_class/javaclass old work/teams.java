 class Teams{

  public static void main(String[] args) {

	System.out.println("type in a NBA team");
	String team = System.console().readLine();
	System.out.println(team);
  	  switch(team) {
        	case "Lakers":
			System.out.println("Kobe's gone who cares");
			break;
		case "Cavilers": 
			System.out.println("Lebron sucks");
			break;
		case "Jazz":
			System.out.println("gordon is gone");
			break;
		case "Warriors":  
			System.out.println("They won");
			break;
		default : 
			System.out.println("Who cares about " + team);
	}
    }

}