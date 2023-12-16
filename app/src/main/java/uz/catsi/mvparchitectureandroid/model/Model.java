package uz.catsi.mvparchitectureandroid.model;

import android.os.Handler;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import uz.catsi.mvparchitectureandroid.contract.Contract;

public class Model implements Contract.Model {


    private List<String> arrayList = Arrays.asList(
            "Android",
            "Flutter",
            "Frontend",
            "Backend",
            "Design"
    );

    @Override
    public void getNextCourse(final OnFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onFinished(getRandomString());
            }
        }, 1200);
    }


    private String getRandomString() {
        Random random = new Random();
        int index = random.nextInt(arrayList.size());
        return arrayList.get(index);
    }
}
