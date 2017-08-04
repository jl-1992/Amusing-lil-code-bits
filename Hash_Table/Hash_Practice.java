class Hash_Practice{
	
	public static void main(String[] args){
		String keys[] = {"Karen", "Jessica", "Margaret", "Jim",
						  "Bob", "Warren", "Jacob", "Joseph",
						  "Fish", "April", "Summer", "Katie",
						  "Alex", "John", "Taylor", "Shirley"};

		HashTable h = new HashTable();

		for(int i=0;i<keys.length;++i){
			h.put(keys[i],i+1);
		}

		h.printHash();
		System.out.println(h.get("Margaret"));
	}
}