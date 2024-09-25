package net.politwineteamradio;

import net.politwineteamradio.cmd.MainCmd;
import net.politwineteamradio.listener.PWTRListener;
import net.politwineteamradio.process.MainSong;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class PolitWineTeamRadio extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PWTRListener(this), this);
        getLogger().info(ChatColor.DARK_GREEN + "PBRadio начало свою работу успшено");
        this.getCommand("pwtr").setExecutor(new MainCmd(this));
        WaveRetroFM();
        WaveRodinaFM();
        WaveGrusnoRadio();
        WaveRadioENERGY();
        WaveRadioXIT();
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
                MainSong.RestartSongPlugin1();
            }
        }, 5460);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b3;
                MainSong.RetroFMa = a3;
                MainSong.RestartSongPlugin1();
            }
        }, 9310);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b4;
                MainSong.RetroFMa = a4;
                MainSong.RestartSongPlugin1();
            }
        }, 14270);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b5;
                MainSong.RetroFMa = a5;
                MainSong.RestartSongPlugin1();
            }
        }, 20230);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b6;
                MainSong.RetroFMa = a6;
                MainSong.RestartSongPlugin1();
            }
        }, 23190);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b7;
                MainSong.RetroFMa = a7;
                MainSong.RestartSongPlugin1();
            }
        }, 26910);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b8;
                MainSong.RetroFMa = a8;
                MainSong.RestartSongPlugin1();
            }
        }, 30630);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b9;
                MainSong.RetroFMa = a9;
                MainSong.RestartSongPlugin1();
            }
        }, 35710);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b10;
                MainSong.RetroFMa = a10;
                MainSong.RestartSongPlugin1();
            }
        }, 41030);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b11;
                MainSong.RetroFMa = a11;
                MainSong.RestartSongPlugin1();
            }
        }, 44970);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b12;
                MainSong.RetroFMa = a12;
                MainSong.RestartSongPlugin1();
            }
        }, 49450);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RetroFM = b1;
                MainSong.RetroFMa = a1;
                MainSong.RestartSongPlugin1();
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
                MainSong.RodinaFM = b2;
                MainSong.RodinaFMa = a2;
                MainSong.RestartSongPlugin2();
            }
        }, 4500);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RodinaFM = b3;
                MainSong.RodinaFMa = a3;
                MainSong.RestartSongPlugin2();
            }
        }, 8140);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RodinaFM = b4;
                MainSong.RodinaFMa = a4;
                MainSong.RestartSongPlugin2();
            }
        }, 14540);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RodinaFM = b5;
                MainSong.RodinaFMa = a5;
                MainSong.RestartSongPlugin2();
            }
        }, 18460);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RodinaFM = b6;
                MainSong.RodinaFMa = a6;
                MainSong.RestartSongPlugin2();
            }
        }, 21240);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RodinaFM = b7;
                MainSong.RodinaFMa = a7;
                MainSong.RestartSongPlugin2();
            }
        }, 24640);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RodinaFM = b8;
                MainSong.RodinaFMa = a8;
                MainSong.RestartSongPlugin2();
            }
        }, 30760);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RodinaFM = b9;
                MainSong.RodinaFMa = a9;
                MainSong.RestartSongPlugin2();
            }
        }, 33640);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RodinaFM = b1;
                MainSong.RodinaFMa = a1;
                MainSong.RestartSongPlugin2();
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
                MainSong.GrusnoRadio = b2;
                MainSong.GrusnoRadioa = a2;
                MainSong.RestartSongPlugin3();
            }
        }, 5940);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.GrusnoRadio = b3;
                MainSong.GrusnoRadioa = a3;
                MainSong.RestartSongPlugin3();
            }
        }, 10780);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.GrusnoRadio = b4;
                MainSong.GrusnoRadioa = a4;
                MainSong.RestartSongPlugin3();
            }
        }, 14200);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.GrusnoRadio = b5;
                MainSong.GrusnoRadioa = a5;
                MainSong.RestartSongPlugin3();
            }
        }, 22260);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.GrusnoRadio = b6;
                MainSong.GrusnoRadioa = a6;
                MainSong.RestartSongPlugin3();
            }
        }, 26200);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.GrusnoRadio = b7;
                MainSong.GrusnoRadioa = a7;
                MainSong.RestartSongPlugin3();
            }
        }, 30040);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.GrusnoRadio = b8;
                MainSong.GrusnoRadioa = a8;
                MainSong.RestartSongPlugin3();
            }
        }, 33960);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.GrusnoRadio = b9;
                MainSong.GrusnoRadioa = a9;
                MainSong.RestartSongPlugin3();
            }
        }, 39060);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.GrusnoRadio = b10;
                MainSong.GrusnoRadioa = a10;
                MainSong.RestartSongPlugin3();
            }
        }, 42800);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.GrusnoRadio = b1;
                MainSong.GrusnoRadioa = a1;
                MainSong.RestartSongPlugin3();
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
                MainSong.RadioENERGY = b2;
                MainSong.RadioENERGYa = a2;
                MainSong.RestartSongPlugin4();
            }
        }, 3300);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RadioENERGY = b3;
                MainSong.RadioENERGYa = a3;
                MainSong.RestartSongPlugin4();
            }
        }, 6600);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RadioENERGY = b4;
                MainSong.RadioENERGYa = a4;
                MainSong.RestartSongPlugin4();
            }
        }, 10340);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RadioENERGY = b5;
                MainSong.RadioENERGYa = a5;
                MainSong.RestartSongPlugin4();
            }
        }, 14160);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RadioENERGY = b6;
                MainSong.RadioENERGYa = a6;
                MainSong.RestartSongPlugin4();
            }
        }, 18100);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RadioENERGY = b7;
                MainSong.RadioENERGYa = a7;
                MainSong.RestartSongPlugin4();
            }
        }, 22100);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RadioENERGY = b8;
                MainSong.RadioENERGYa = a8;
                MainSong.RestartSongPlugin4();
            }
        }, 26120);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RadioENERGY = b9;
                MainSong.RadioENERGYa = a9;
                MainSong.RestartSongPlugin4();
            }
        }, 30200);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RadioENERGY = b10;
                MainSong.RadioENERGYa = a10;
                MainSong.RestartSongPlugin4();
            }
        }, 35020);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RadioENERGY = b11;
                MainSong.RadioENERGYa = a11;
                MainSong.RestartSongPlugin4();
            }
        }, 39360);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RadioENERGY = b12;
                MainSong.RadioENERGYa = a12;
                MainSong.RestartSongPlugin4();
            }
        }, 43220);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RadioENERGY = b1;
                MainSong.RadioENERGYa = a1;
                MainSong.RestartSongPlugin4();
                WaveRadioENERGY();
            }
        }, 48320);
    }

    public void WaveRadioXIT() {
        String a1 = "moonlight - speed up, Nightcore";
        String b1 = "5moonlight";
        String a2 = "Скажи мне кто ты - xxxmanera";
        String b2 = "5skazimnektoti";
        String a3 = "Мох - Oxxxymiron";
        String b3 = "5mox";
        String a4 = "Тесно - Aarne, BUSHIDO ZHO, ANIKV";
        String b4 = "5tesno";
        String a5 = "На чиле - Джиган, ЕГОР КРИД, The Limba";
        String b5 = "5nachile";
        String a6 = "Капитал - Noiz MC, Ляпис Трубецкой";
        String b6 = "5kapital";
        String a7 = "Опа опа Америка Европа";
        String b7 = "5opaopaamerika";
        String a8 = "Double Cup - MORGENSHTERN, kizary";
        String b8 = "5doublecup";
        String a9 = "PAIN VIBES - BUSHIDO ZHO, blago white";
        String b9 = "5painvibe";
        String a10 = "PAIN VIBES 2 - BUSHIDO ZHO, blago white";
        String b10 = "5painvibe2";
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RadioXIT = b2;
                MainSong.RadioXITa = a2;
                MainSong.RestartSongPlugin5();
            }
        }, 3380);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RadioXIT = b3;
                MainSong.RadioXITa = a3;
                MainSong.RestartSongPlugin5();
            }
        }, 6120);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RadioXIT = b4;
                MainSong.RadioXITa = a4;
                MainSong.RestartSongPlugin5();
            }
        }, 8740);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RadioXIT = b5;
                MainSong.RadioXITa = a5;
                MainSong.RestartSongPlugin5();
            }
        }, 11820);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RadioXIT = b6;
                MainSong.RadioXITa = a6;
                MainSong.RestartSongPlugin5();
            }
        },18740);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RadioXIT = b7;
                MainSong.RadioXITa = a7;
                MainSong.RestartSongPlugin5();
            }
        }, 21800);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RadioXIT = b8;
                MainSong.RadioXITa = a8;
                MainSong.RestartSongPlugin5();
            }
        }, 25960);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RadioXIT = b9;
                MainSong.RadioXITa = a9;
                MainSong.RestartSongPlugin5();
            }
        }, 30000);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RadioXIT = b10;
                MainSong.RadioXITa = a10;
                MainSong.RestartSongPlugin5();
            }
        }, 32700);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                MainSong.RadioXIT = b1;
                MainSong.RadioXITa = a1;
                MainSong.RestartSongPlugin5();
                WaveRadioXIT();
            }
        }, 36560);
    }
}
