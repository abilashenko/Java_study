package Lesson5.Task2;

public class RAM implements Component {
    private int frequency;
    private int memory;
    private String memoryType;
    private String manufacturer;

    public RAM(int frequency, int memory, String memoryType, String manufacturer) {
        this.frequency = frequency;
        this.memory = memory;
        this.memoryType = memoryType;
        this.manufacturer = manufacturer;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getMemory() {
        return memory;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String getInfo() {
        String str = "";
        str += "Частота (МГц): " + frequency + ",";
        str += " Память (GB): " + memory + ",";
        str += " Тип памяти: " + memoryType + ",";
        str += " Производитель: " + manufacturer;
        return str;
    }
}
