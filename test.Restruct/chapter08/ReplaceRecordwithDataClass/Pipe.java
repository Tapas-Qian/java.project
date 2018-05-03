package chapter08.ReplaceRecordwithDataClass;

/**
 * 这种形式的类可能是：
 * 1，数据泥团，比如初始化几种Pipe，然后只是简单的算一下有几种类型的Pipe
 * 2，正真面向对象的，数据和处理数据的行为在一起，比如在我写的AutoCAD程序中的Pipe类，每种
 * 材料都根据了相关数据获得了，重量，PartNumber，排序值等
 */
public class Pipe {
	private int size;
	private String schedule;
	private String material;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
}
