package net.pbradio;

import net.pbradio.cmd.PlaySong;
import net.pbradio.listener.PBRadioListiner;
import net.pbradio.process.MainSong;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class PBRadion extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PBRadioListiner(this), this);
        getLogger().info(ChatColor.DARK_GREEN + "PBRadio начало свою работу успшено");
        this.getCommand("songstart").setExecutor(new PlaySong());
        this.getCommand("pbradio").setExecutor(this);
        WaveRetroFM();
        WaveRodinaFM();
        WaveGrusnoRadio();
    }

    @Override
    public void onDisable() {
        getLogger().info(ChatColor.DARK_RED + "PBRadio теперь выключен");

    }

    public void WaveRetroFM() {
        String a1 = "Музыка нас вязала - Мираж";
        String b1 = "1musicnassvizala";
        String a2 = "Прекрасное Далёко - Большой детский хор";
        String b2 = "1precrasnoedaloko";
        String a3 = "Хали-гали, паратрупер - Леприконсы";
        String b3 = "1xaligali";
        String a4 = "Что такое осень - ДДТ";
        String b4 = "1chtotakoeosen";
        String a5 = "Восточные сказки - Блестящие";
        String b5 = "1vostochniskazki";
        String a6 = "Территория - Город 312";
        String b6 = "1territoria";
        String a7 = "Город сочи - Сергей Трофимов";
        String b7 = "1gorodsochi";
        String a8 = "Ветер в голове - Сергей Трофимов";
        String b8 = "1vetervgolove";
        String a9 = "Наступает ночь 2000 - Мираж";
        String b9 = "1nastupaetnoch";
        String a10 = "Москвоская песня - Сергей Трофимов";
        String b10 = "1moskovskaipesna";
        String a11 = "Режиссер - Градусы";
        String b11 = "1rezisori";
        String a12 = "Цифровое небо - Алексей Марковников";
        String b12 = "1sifrovoenebo";
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b2;
                MainSong.RetroFMa = a2;
                MainSong.RestartRertoFM();
            }
        }, 5460);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b3;
                MainSong.RetroFMa = a3;
                MainSong.RestartRertoFM();
            }
        }, 9310);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b4;
                MainSong.RetroFMa = a4;
                MainSong.RestartRertoFM();
            }
        }, 14270);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b5;
                MainSong.RetroFMa = a5;
                MainSong.RestartRertoFM();
            }
        }, 20230);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b6;
                MainSong.RetroFMa = a6;
                MainSong.RestartRertoFM();
            }
        }, 23190);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b7;
                MainSong.RetroFMa = a7;
                MainSong.RestartRertoFM();
            }
        }, 26910);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b8;
                MainSong.RetroFMa = a8;
                MainSong.RestartRertoFM();
            }
        }, 30630);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b9;
                MainSong.RetroFMa = a9;
                MainSong.RestartRertoFM();
            }
        }, 35710);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b10;
                MainSong.RetroFMa = a10;
                MainSong.RestartRertoFM();
            }
        }, 41030);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b11;
                MainSong.RetroFMa = a11;
                MainSong.RestartRertoFM();
            }
        }, 44970);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b12;
                MainSong.RetroFMa = a12;
                MainSong.RestartRertoFM();
            }
        }, 49450);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b1;
                MainSong.RetroFMa = a1;
                MainSong.RestartRertoFM();
                WaveRetroFM();
            }
        }, 53590);
    }

    public void WaveRodinaFM() {
        String a1 = "И вновь продолжается бой! - Иосиф Кобзон";
        String b1 = "2ivnivprodolzaetsaboy";
        String a2 = "Родина - Анимация";
        String b2 = "2rodina";
        String a3 = "Мы не оставим города свои - Декабрь";
        String b3 = "2mineostavimgorods";
        String a4 = "Товарищ майор - Сатисфакция";
        String b4 = "2tovarishmayor";
        String a5 = "Павшим за Третий Рим - Тим Скоренко";
        String b5 = "2pavshixzarim";
        String a6 = "Тот, который не стрелял - Владимир Высоцкий";
        String b6 = "2totkotorinestrel";
        String a7 = "Комбат - Любэ";
        String b7 = "2kombat";
        String a8 = "Отряд не заметил потери бойцы - Егор Летов";
        String b8 = "2otradnezametil";
        String a9 = "Фантом - Чиж";
        String b9 = "2fantom";
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b2;
                MainSong.RetroFMa = a2;
                MainSong.RestartRodinaFM();
            }
        }, 4500);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b3;
                MainSong.RetroFMa = a3;
                MainSong.RestartRodinaFM();
            }
        }, 8140);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b4;
                MainSong.RetroFMa = a4;
                MainSong.RestartRodinaFM();
            }
        }, 14540);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b5;
                MainSong.RetroFMa = a5;
                MainSong.RestartRodinaFM();
            }
        }, 18460);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b6;
                MainSong.RetroFMa = a6;
                MainSong.RestartRodinaFM();
            }
        }, 21240);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b7;
                MainSong.RetroFMa = a7;
                MainSong.RestartRodinaFM();
            }
        }, 24640);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b8;
                MainSong.RetroFMa = a8;
                MainSong.RestartRodinaFM();
            }
        }, 30760);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b9;
                MainSong.RetroFMa = a9;
                MainSong.RestartRodinaFM();
            }
        }, 33640);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b1;
                MainSong.RetroFMa = a1;
                MainSong.RestartRodinaFM();
                WaveRodinaFM();
            }
        }, 40820);
    }

    public void WaveGrusnoRadio() {
        String a1 = "Перемен - КИНО";
        String b1 = "3peremen";
        String a2 = "Just the Two of Us - Grover Washington";
        String b2 = "3justtwous";
        String a3 = "Забытые ботинки - Король и Шут";
        String b3 = "3zabitbitinki";
        String a4 = "Кукушка - КИНО";
        String b4 = "3kukushka";
        String a5 = "The Lost Soul Down - NBSPLV";
        String b5 = "3thelostsouldown";
        String a6 = "Кофе мой друг - Нервы";
        String b6 = "3coffimyfrend";
        String a7 = "California Dreamin - The Beach Boys";
        String b7 = "3cakiforndream";
        String a8 = "Mockingbird - Eminem";
        String b8 = "3mockingbird";
        String a9 = "Линия жизни - Сплин";
        String b9 = "3liniazizni";
        String a10 = "Пластинки - Дурной вкус";
        String b10 = "3plastinka";
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b2;
                MainSong.RetroFMa = a2;
                MainSong.RestartGrusnoRadio();
            }
        }, 5940);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b3;
                MainSong.RetroFMa = a3;
                MainSong.RestartGrusnoRadio();
            }
        }, 10780);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b4;
                MainSong.RetroFMa = a4;
                MainSong.RestartGrusnoRadio();
            }
        }, 14200);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b5;
                MainSong.RetroFMa = a5;
                MainSong.RestartGrusnoRadio();
            }
        }, 22260);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b6;
                MainSong.RetroFMa = a6;
                MainSong.RestartGrusnoRadio();
            }
        }, 26200);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b7;
                MainSong.RetroFMa = a7;
                MainSong.RestartGrusnoRadio();
            }
        }, 30040);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b8;
                MainSong.RetroFMa = a8;
                MainSong.RestartGrusnoRadio();
            }
        }, 33960);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b9;
                MainSong.RetroFMa = a9;
                MainSong.RestartGrusnoRadio();
            }
        }, 39060);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b10;
                MainSong.RetroFMa = a10;
                MainSong.RestartGrusnoRadio();
            }
        }, 42800);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b1;
                MainSong.RetroFMa = a1;
                MainSong.RestartGrusnoRadio();
                WaveGrusnoRadio();
            }
        }, 46460);
    }

    public void WaveRadioENERGY() {
        String a1 = "Bones - Imagine Dragons";
        String b1 = "4bones";
        String a2 = "Где-то - Фанкин";
        String b2 = "4gdeto";
        String a3 = "Дорога в облака - Браво";
        String b3 = "4dorogavobloca";
        String a4 = "Radioactive - Imagine Dragons";
        String b4 = "4radioactive";
        String a5 = "Однажды мир прогнётся под нас - Машина времени";
        String b5 = "4odnazdimir";
        String a6 = "Jerk it Out - Caesars";
        String b6 = "4jerkitout";
        String a7 = "Аргентина-Ямайка - 5:0 - ЧайФ";
        String b7 = "4argentina";
        String a8 = "Да здравствует футбол - Сергей Трофимов";
        String b8 = "4futtballtroaimov";
        String a9 = "Танец злобного гения - Король и Шут";
        String b9 = "4tanecgenia";
        String a10 = "Улыбайся - IOWA";
        String b10 = "4ulibaisa";
        String a11 = "Побеждать и любить - T9";
        String b11 = "4pobezdatilove";
        String a12 = "Никто не сможет меня остановить - 25/17";
        String b12 = "4niktonesmozet";
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b2;
                MainSong.RetroFMa = a2;
                MainSong.RestartGrusnoRadio();
            }
        }, 5940);
    }

    private long startTime;
    private boolean isRunning;
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args[0].equals("1")) {
            if (!isRunning) {
                startTime = System.currentTimeMillis();
                isRunning = true;
                sender.sendMessage("Секундомер запущен!");
            } else {
                sender.sendMessage("Секундомер уже запущен");
            }
        }
        if (args[0].equals("2")) {
            if (isRunning) {
                long elapsedTime = System.currentTimeMillis() - startTime;
                long elapsedSeconds = elapsedTime / 1000;
                sender.sendMessage("Прошло времени: " + elapsedSeconds + " секунд");
            } else {
                sender.sendMessage("Секундомер не запущен");
            }
        }
        if (args[0].equals("3")) {
            if (isRunning) {
                isRunning = false;
                sender.sendMessage("Секундомер остановле");
            } else {
                sender.sendMessage("Секундомер не запущен");
            }
        }
        return true;
    }
}
