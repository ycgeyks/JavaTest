package org.example;

import java.util.function.Supplier;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // 使用 Supplier 提供当前时间的操作
        Supplier<String> currentTimeSupplier = () -> {
            long currentTimeMillis = System.currentTimeMillis();
            return "Current Time: " + currentTimeMillis;
        };

        // 调用 get 方法获取当前时间的字符串表示
        String currentTime = currentTimeSupplier.get();
        String currentTime2 = currentTimeSupplier.get();
        System.out.println(currentTime);

        // 使用 Supplier 提供默认值的操作
        String defaultValue = getDefaultValue(() -> "No value provided");
        System.out.println(defaultValue);
    }

    // 接收一个 Supplier，如果其提供的值为空，则返回默认值
    private static String getDefaultValue(Supplier<String> valueSupplier) {
        String value = valueSupplier.get();
        return value != null ? value : "Default Value";
    }
}

