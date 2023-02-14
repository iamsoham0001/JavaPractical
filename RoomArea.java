class Room 
{
	float len,br;
	void getdata(float a, float b)
	{
		len = a;
		br = b;
	}
}
class RoomArea
{
	public static void main(String args[])
	{
		Room r = new Room();
		r.getdata(14.04f,10.0f);
		float area = r.len * r.br;
		System.out.println("Area = "+area);
	}
}