package miHexagonal.core.domain;

public class Book {
    private Long id;
    private String name;
    //constructors //getters and setters ç
    
    
    public Book (long in ,String name) {
    	id=in;
    	this.name=name;
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}