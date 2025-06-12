package utils;
import java.util.logging .*;
public class LoggerConfig {
    private LoggerConfig() {
    }

    public static void configurarLogger() {
            Logger rootLogger = Logger.getLogger("");
            Handler[] handlers = rootLogger.getHandlers();

            // Eliminar handlers por defecto (que muestran clase, fecha, etc.)
            for (Handler handler : handlers) {
                rootLogger.removeHandler(handler);
            }

            // Crear un nuevo handler con formato simplificado
            ConsoleHandler handler = new ConsoleHandler();
            handler.setFormatter(new SimpleFormatter() {
                @Override
                public synchronized String format(LogRecord recorda) {
                    return String.format("%s%n", recorda.getMessage()); // Solo el mensaje
                }
            });

            handler.setLevel(Level.ALL);
            rootLogger.addHandler(handler);
            rootLogger.setLevel(Level.ALL);
        }
    }

