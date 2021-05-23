package cn.gd.cz.hong.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PrinterFactory {

    private Map<String, Printer> printers = new HashMap<String, Printer>();

    public Printer getPrinterByKey(String key) {
        Printer printer = printers.get(key);
        if (printer == null) {
            Class<?> clazz;
            try {
                clazz = Class.forName(key);
                printer = (Printer) clazz.newInstance();
                printers.put(key, printer);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("从映射中拿到对象 而不是自己再次创建对象");
        }
        return printer;
    }
}
