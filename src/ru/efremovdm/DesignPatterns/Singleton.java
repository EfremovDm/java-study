package ru.efremovdm.DesignPatterns;

/**
 * Одиночка (англ. Singleton) — порождающий шаблон проектирования, гарантирующий, что в однопроцессном приложении
 * будет единственный экземпляр некоторого класса, и предоставляющий глобальную точку доступа к этому экземпляру.
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {}

    /**
     * Пример на Java 1.6: без внутренних классов (обычная ленивая несинхронизированная реализация)
     *
     * @return Singleton
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * Пример на Java 1.6: без внутренних классов (ленивая синхронизированная реализация)
     *
     * @return Singleton
     */
    public static Singleton getInstanceSynchronized() {
        Singleton localInstance = instance;
        if (localInstance == null) {
            synchronized (Singleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Singleton();
                }
            }
        }

        return localInstance;
    }

    /**
     * Пример на языке Java: Synchronized
     * @return
     */
    public static synchronized Singleton getInstanceSynchronized2() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
