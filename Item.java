class Item {
	int id;
	String name;
	double price;
	//TODO add variable.
	char danok;
	//TODO constructor
	public Item(int id, String name, double price, char danok) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.danok = danok;
	}
	//TODO setters and getters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public char getDanok() {
		return danok;
	}

	public void setDanok(char danok) {
		this.danok = danok;
	}

	double taxReturn (double price,char danok) {
		//TODO
		float i=0.0;
		if(danok=="A")
		{
			i=0.18;
		}
		else if(danok=="B"){
			i=0.5;
		}
		else if(danok=="V"){
			i=0.0;
		}
		float presmetanDanok;
		presmetanDanok=(price*i);
		return (presmetanDanok*0.15);
	}
}