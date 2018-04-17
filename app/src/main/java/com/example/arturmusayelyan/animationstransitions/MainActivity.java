package com.example.arturmusayelyan.animationstransitions;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView animationTv;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        //animationTv = findViewById(R.id.text_view_for_animation);
        imageView = findViewById(R.id.circle_loading_view);
    }

    public void goToNextActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }

    public void animate(View view) {
//        ValueAnimator animation = ValueAnimator.ofFloat(0f, 100f);
//////        ValueAnimator animation=ValueAnimator.ofObject(new TypeEvaluator() {
//////            @Override
//////            public Object evaluate(float fraction, Object startValue, Object endValue) {
//////                return null;
//////            }
//////        });
////        animation.setDuration(1000);
////        animation.start();
////       // animationTv.setAnimation(animation);

//        TranslateAnimation translateAnimation = new TranslateAnimation(0, 300, 0,0);
//        view.startAnimation(translateAnimation);
//        view.animate().alp
//        AnimatorSet set= (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.anim1);
//        set.setTarget(imageView);
//        set.start();R
        RotateAnimation rotateAnimation=new RotateAnimation(120,120);
        rotateAnimation.setDuration(2000);
        rotateAnimation.setRepeatCount(Animation.INFINITE);
        imageView.startAnimation(rotateAnimation);
  //      animation();
    }

    public void animateImage(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.2f, 1.0f);
        // imageView.animate().alpha(0f);
        alphaAnimation.setDuration(1000);
        alphaAnimation.setStartOffset(5000);
        alphaAnimation.setFillAfter(true);
        imageView.startAnimation(alphaAnimation);
    }
    private void animation(){
        imageView.animate().rotation(720);
    }
}
