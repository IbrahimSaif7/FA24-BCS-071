public class Product{

	private static int counter=0;
	private String id;
	private String name;
	private int quantity;
	private int price;
	private String category;


	Product( String name1, int quantity1, int price1, String category1){
			id=""+counter++;
			name=name1;
			quantity=quantity1;
			price=price1;
			category=category1;
	

		}


	public void setname(String name1){
		name=name1;
		}

	public String getname(){
		return name; 
		}

	public void setquantity(int quant){
		if(quant>0)
		quantity=quant;
		}

	public int getquantity(){
		return quantity; 
		}

	public void setprice(int price1){
		if(price1>0)
		price=price1;
		}

	public int getprice(){
		return price; 
		}

	public void setcategory(String category1){
		category=category1;
		}

	public String getcategory(){
		return category; 
		}

	public void setid(){
		id=id+1;
		}

	public String getid(){
		return id; 
		}

	public void display(){

 		System.out.printf("%-15s:\t %15s\n", "Product id", id);
		System.out.printf("%-15s:\t %15s\n", "Product Name", name);
		System.out.printf("%-15s:\t\t      %d\n", "Quantity", quantity);
		System.out.printf("%-15s:\t\t      %d\n", "Product Price", price);
		System.out.printf("%-15s:\t %15s\n", "category", category);

	}





	
	







}