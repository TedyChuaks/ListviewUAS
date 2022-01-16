package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Buaya;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;
import simple.example.hewanpedia.model.Kuda;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing(ctx.getString(R.string.pe), ctx.getString(R.string.odo),
                ctx.getString(R.string.odol), R.drawable.cat_angora));
        kucings.add(new Kucing(ctx.getString(R.string.ted), ctx.getString(R.string.lol),
                ctx.getString(R.string.lul), R.drawable.cat_bengal));
        kucings.add(new Kucing(ctx.getString(R.string.gg), ctx.getString(R.string.gege),
                ctx.getString(R.string.gaga), R.drawable.cat_birman));
        kucings.add(new Kucing(ctx.getString(R.string.gigi), ctx.getString(R.string.asa),
                ctx.getString(R.string.asus), R.drawable.cat_persia));
        kucings.add(new Kucing(ctx.getString(R.string.lael), ctx.getString(R.string.gaes),
                ctx.getString(R.string.bim), R.drawable.cat_siam));
        kucings.add(new Kucing(ctx.getString(R.string.alay), ctx.getString(R.string.aza),
                ctx.getString(R.string.azu), R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Kuda> initDataKuda(Context ctx) {
        List<Kuda> kudas = new ArrayList<>();
        kudas.add(new Kuda(ctx.getString(R.string.elooo), ctx.getString(R.string.ambo),
                ctx.getString(R.string.uyu), R.drawable.kuda_shire));
        kudas.add(new Kuda(ctx.getString(R.string.luoo), ctx.getString(R.string.yihi),
                ctx.getString(R.string.unaa), R.drawable.kuda_islandia));
        kudas.add(new Kuda(ctx.getString(R.string.jack), ctx.getString(R.string.jeep),
                ctx.getString(R.string.mans), R.drawable.kuda_ferisian));

        return kudas;
    }

    private static List<Buaya>initDataBuaya(Context ctx) {
        List<Buaya> buayas = new ArrayList<>();
        buayas.add(new Buaya(ctx.getString(R.string.pre), ctx.getString(R.string.nas),
                ctx.getString(R.string.acin), R.drawable.nil));
        buayas.add(new Buaya(ctx.getString(R.string.udin), "India Timur",
                ctx.getString(R.string.upin), R.drawable.air_asin));
        buayas.add(new Buaya(ctx.getString(R.string.bung), ctx.getString(R.string.yess),
                ctx.getString(R.string.gan), R.drawable.aligator));
        return buayas;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataKuda(ctx));
        hewans.addAll(initDataBuaya(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
