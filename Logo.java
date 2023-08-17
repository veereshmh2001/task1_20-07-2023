class Logo{
	
	String shape;
    String color;
    int width;
    int height;
    boolean is3D;
    String text;
    String font;
    String slogan;
    String sloganColor;
	
	Logo()
	{
		System.out.println("invoking main in Logo");
		System.out.println("Shape:"+this.shape);
		System.out.println("color:"+this.color);
		System.out.println("width:"+this.width);
		System.out.println("height:"+this.height);
		System.out.println("is3D:"+this.is3D);
		System.out.println("text:"+this.text);
		System.out.println("font:"+this.font);
		System.out.println("slogan:"+this.slogan);
		System.out.println("sloganColor:"+this.sloganColor);
		System.out.println("\n");
	}
	
	Logo(String shape)
	{
		System.out.println("invoking in Logo");
		this.shape = shape;
        this.color = color;
        this.width = width;
        this.height = height;
        this.is3D = is3D;
        this.text = text;
        this.font = font;
        this.slogan = slogan;
        this.sloganColor = sloganColor;
	}
	
	Logo(String shape, String color, int width)
	{
		System.out.println("invoking in Logo");
		this.shape = shape;
        this.color = color;
        this.width = width;
        this.height = height;
        this.is3D = is3D;
        this.text = text;
        this.font = font;
        this.slogan = slogan;
        this.sloganColor = sloganColor;
	}
	
	Logo(String shape, String color, int width, int height, boolean is3D, String text)
	{
		System.out.println("invoking in Logo");
		this.shape = shape;
        this.color = color;
        this.width = width;
        this.height = height;
        this.is3D = is3D;
        this.text = text;
        this.font = font;
        this.slogan = slogan;
        this.sloganColor = sloganColor;
	}
	
	Logo(String shape, String color, int width, int height, boolean is3D, String text, String font, String slogan, String sloganColor)
	{
		System.out.println("invoking in Logo");
		this.shape = shape;
        this.color = color;
        this.width = width;
        this.height = height;
        this.is3D = is3D;
        this.text = text;
        this.font = font;
        this.slogan = slogan;
        this.sloganColor = sloganColor;
	}
}