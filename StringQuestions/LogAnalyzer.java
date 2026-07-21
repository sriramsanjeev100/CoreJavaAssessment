package StringQuestions;
import java.util.HashSet;

public class LogAnalyzer
{
    public static void main(String[] args)
    {
        String[] logs = {"INFO|2026-07-20|User Login|John",
                "ERROR|2026-07-20|Database Timeout",
                "INFO|2026-07-20|Logout|John",
                "WARNING|2026-07-20|Low Memory"
        };

        int info = 0, error = 0, warning = 0;
        String lastUser = "";
        HashSet<String> users = new HashSet<>();

        for (String log : logs)
        {
            if (log.startsWith("INFO"))
            {
                info++;

                if (log.contains("User Login") || log.contains("Logout"))
                {
                    int lastPipe = log.lastIndexOf('|');
                    lastUser = log.substring(lastPipe + 1);
                    users.add(lastUser);
                }

            }

            else if (log.startsWith("ERROR"))
            {
                error++;
            }

            else if (log.startsWith("WARNING"))
            {
                warning++;
            }
        }

        System.out.println("Total INFO Logs : " + info);
        System.out.println("Total ERROR Logs : " + error);
        System.out.println("Total WARNING Logs : " + warning);
        System.out.println("Last Logged User : " + lastUser);
        System.out.println("Unique Users : " + users.size());
    }
}
