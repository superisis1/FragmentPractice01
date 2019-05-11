package kr.insungjung.fragmentpractice01;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import kr.insungjung.fragmentpractice01.Adapters.PagerAdapter;
import kr.insungjung.fragmentpractice01.databinding.ActivityMainBinding;
import kr.insungjung.fragmentpractice01.fragments.FragmentTwo;

public class MainActivity extends BaseActivity {

    ActivityMainBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main); // bindVeiws() 내부로 이동
        bindViews();
        setupEvents();
        setValues();

    }

    @Override
    public void setupEvents() {

        // 디폴트 - 1번 페이지 선택
        act.viewPager.setCurrentItem(0);
        act.changeFragOneBtn.setText("현재 선택됨");
        act.changeFragTwoBtn.setText("2번 선택됨");
        act.changeFragThreeBtn.setText("3번 선택됨");

        act.changeFragOneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                act.viewPager.setCurrentItem(0);

                act.changeFragOneBtn.setText("현재 선택됨");
                act.changeFragTwoBtn.setText("2번 선택됨");
                act.changeFragThreeBtn.setText("3번 선택됨");
            }
        });

        /*프래그먼트 2번 버튼 클릭*/
        act.changeFragTwoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* Fragment fragment = new FragmentTwo();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragOne, fragment);
                fragmentTransaction.commit();*/

                /*2번 화면 버튼 누름 => 2번째 페이지 보여줌*/

                act.viewPager.setCurrentItem(1);

                act.changeFragOneBtn.setText("1번 선택됨");
                act.changeFragTwoBtn.setText("현재 선택됨");
                act.changeFragThreeBtn.setText("3번 선택됨");
            }
        });

        act.changeFragThreeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                act.viewPager.setCurrentItem(2);

                act.changeFragOneBtn.setText("1번 선택됨");
                act.changeFragTwoBtn.setText("2번 선택됨");
                act.changeFragThreeBtn.setText("현재 선택됨");
            }
        });

        /*페이지를 슬라이드 하면 버튼에 영향주는 코드*/
        act.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            // 가장 중요
            @Override
            public void onPageSelected(int i) {

                if (i == 0) {
                    act.changeFragOneBtn.setText("현재 선택됨");
                    act.changeFragTwoBtn.setText("2번 선택됨");
                    act.changeFragThreeBtn.setText("3번 선택됨");
                } else if (i == 1) {
                    act.changeFragOneBtn.setText("1번 선택됨");
                    act.changeFragTwoBtn.setText("현재 선택됨");
                    act.changeFragThreeBtn.setText("3번 선택됨");
                } else if (i == 2) {
                    act.changeFragOneBtn.setText("1번 선택됨");
                    act.changeFragTwoBtn.setText("2번 선택됨");
                    act.changeFragThreeBtn.setText("현재 선택됨");
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

    @Override
    public void setValues() {

        act.viewPager.setOffscreenPageLimit(4); // 프래그먼의 개수와 맞춰준다.

        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), 3);
        act.viewPager.setAdapter(pagerAdapter);
    }

    @Override
    public void bindViews() {
        act = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }
}
