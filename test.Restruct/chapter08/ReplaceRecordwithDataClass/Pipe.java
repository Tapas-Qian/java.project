package chapter08.ReplaceRecordwithDataClass;

/**
 * ������ʽ��������ǣ�
 * 1���������ţ������ʼ������Pipe��Ȼ��ֻ�Ǽ򵥵���һ���м������͵�Pipe
 * 2�������������ģ����ݺʹ������ݵ���Ϊ��һ�𣬱�������д��AutoCAD�����е�Pipe�࣬ÿ��
 * ���϶�������������ݻ���ˣ�������PartNumber������ֵ��
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
