package com.example.flyhigh;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MeditateFragment extends Fragment{

    MediaPlayer player;
    ImageView med1Btn,med2Btn, med3Btn, med4Btn, med5Btn, med6Btn,med7Btn, med8Btn, med9Btn, med10Btn;
    ImageView med1Btns,med2Btns, med3Btns, med4Btns, med5Btns, med6Btns,med7Btns, med8Btns, med9Btns, med10Btns;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View mv = inflater.inflate(R.layout.fragment_meditate, container, false);

        med1Btn = mv.findViewById(R.id.sound1Btn);
        med2Btn = mv.findViewById(R.id.sound2Btn);
        med3Btn = mv.findViewById(R.id.sound3Btn);
        med4Btn = mv.findViewById(R.id.sound4Btn);
        med5Btn = mv.findViewById(R.id.sound5Btn);
        med6Btn = mv.findViewById(R.id.sound6Btn);
        med7Btn = mv.findViewById(R.id.sound7Btn);
        med8Btn = mv.findViewById(R.id.sound8Btn);
        med9Btn = mv.findViewById(R.id.sound9Btn);
        med10Btn = mv.findViewById(R.id.sound10Btn);

        med1Btns = mv.findViewById(R.id.sound1Btns);
        med2Btns = mv.findViewById(R.id.sound2Btns);
        med3Btns = mv.findViewById(R.id.sound3Btns);
        med4Btns = mv.findViewById(R.id.sound4Btns);
        med5Btns = mv.findViewById(R.id.sound5Btns);
        med6Btns = mv.findViewById(R.id.sound6Btns);
        med7Btns = mv.findViewById(R.id.sound7Btns);
        med8Btns = mv.findViewById(R.id.sound8Btns);
        med9Btns = mv.findViewById(R.id.sound9Btns);
        med10Btns = mv.findViewById(R.id.sound10Btns);

        med1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckSound(1);
            }
        });

        med2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckSound(2);
            }
        });

        med3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckSound(3);
            }
        });

        med4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckSound(4);
            }
        });
        med5Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckSound(5);
            }
        });
        med6Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckSound(6);
            }
        });
        med7Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckSound(7);
            }
        });
        med8Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckSound(8);
            }
        });
        med9Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckSound(9);
            }
        });
        med10Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckSound(10);
            }
        });

        med1Btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pausePlayer();
            }
        });

        med2Btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pausePlayer();
            }
        });

        med3Btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pausePlayer();
            }
        });

        med4Btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pausePlayer();
            }
        });
        med5Btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pausePlayer();
            }
        });
        med6Btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pausePlayer();
            }
        });
        med7Btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pausePlayer();
            }
        });
        med8Btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pausePlayer();
            }
        });
        med9Btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pausePlayer();
            }
        });
        med10Btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pausePlayer();
            }
        });

        return mv;
    }

    private void pausePlayer() {
        if(player == null){
            return;
        }
        if (player.isPlaying()){
            player.pause();
            player = null;
        }else{
            player = null;
        }

    }

    private void CheckSound(int i) {

        if(player == null){
            player = setSound(i);
            player.start();
        }

        if (player.isPlaying()){
            player.pause();
            player = setSound(i);
            player.start();
        }
    }

    private MediaPlayer setSound(int i) {
        MediaPlayer play = null;
        switch (i){
            case 1:
                play = MediaPlayer.create(getActivity(), R.raw.sound1);
                break;
            case 2:
                play = MediaPlayer.create(getActivity(), R.raw.sound2);
                break;
            case 3:
                play = MediaPlayer.create(getActivity(), R.raw.sound3);
                break;
            case 4:
                play = MediaPlayer.create(getActivity(), R.raw.sound4);
                break;
            case 5:
                play = MediaPlayer.create(getActivity(), R.raw.sound5);
                break;
            case 6:
                play = MediaPlayer.create(getActivity(), R.raw.sound6);
                break;
            case 7:
                play = MediaPlayer.create(getActivity(), R.raw.sound7);
                break;
            case 8:
                play = MediaPlayer.create(getActivity(), R.raw.sound8);
                break;
            case 9:
                play = MediaPlayer.create(getActivity(), R.raw.sound9);
                break;
            case 10:
                play = MediaPlayer.create(getActivity(), R.raw.sound10);
                break;
            default:
                break;
        }

        return play;
    }

}
