/**
*Jake Leiendecker - 900930049
*CIS175 23970 - Java II
*Mar 7, 2022
**/
package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author jake
 *
 */
@Entity
public class PC {
	@Id
	@GeneratedValue
	private long id;
	private String graphics;
	private int processor;
	private String motherboard;
	private int ram;

	public PC() {
		super();
	}

	public PC(int processor) {
		setProcessor(processor);
	}

	public PC(String graphics, int processor, String motherboard, int ram) {
		setGraphics(graphics);
		setProcessor(processor);
		setMotherboard(motherboard);
		setRam(ram);
	}
	public PC(long id, String graphics, int processor, String motherboard, int ram) {
		setId(id);
		setGraphics(graphics);
		setProcessor(processor);
		setMotherboard(motherboard);
		setRam(ram);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGraphics() {
		return graphics;
	}

	public void setGraphics(String graphics) {
		this.graphics = graphics;
	}

	public int getProcessor() {
		return processor;
	}

	public void setProcessor(int processor) {
		this.processor = processor;
	}

	public String getMotherboard() {
		return motherboard;
	}

	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "PC [id=" + id + ", " + (graphics != null ? "graphics=" + graphics + ", " : "") + "processor="
				+ processor + "k, " + (motherboard != null ? "motherboard=" + motherboard + ", " : "") + "ram=" + ram
				+ "gbs]";
	}
}
