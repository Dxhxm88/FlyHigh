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


public class ZkrFragment extends Fragment {

    ImageView zkr1Btn, zkr2Btn, zkr3Btn, zkr4Btn, zkr5Btn, zkr6Btn, zkr7Btn, zkr8Btn, zkr9Btn, zkr10Btn;
    ImageView zkr1Btns, zkr2Btns, zkr3Btns, zkr4Btns, zkr5Btns, zkr6Btns, zkr7Btns, zkr8Btns, zkr9Btns, zkr10Btns;

    MediaPlayer player;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mv = inflater.inflate(R.layout.fragment_zkr, container, false);

        zkr1Btn = mv.findViewById(R.id.zikir1Btn);
        zkr2Btn = mv.findViewById(R.id.zikir2Btn);
        zkr3Btn = mv.findViewById(R.id.zikir3Btn);
        zkr4Btn = mv.findViewById(R.id.zikir4Btn);
        zkr5Btn = mv.findViewById(R.id.zikir5Btn);
        zkr6Btn = mv.findViewById(R.id.zikir6Btn);
        zkr7Btn = mv.findViewById(R.id.zikir7Btn);
        zkr8Btn = mv.findViewById(R.id.zikir8Btn);
        zkr9Btn = mv.findViewById(R.id.zikir9Btn);
        zkr10Btn = mv.findViewById(R.id.zikir10Btn);

        zkr1Btns = mv.findViewById(R.id.zikir1Btns);
        zkr2Btns = mv.findViewById(R.id.zikir2Btns);
        zkr3Btns = mv.findViewById(R.id.zikir3Btns);
        zkr4Btns = mv.findViewById(R.id.zikir4Btns);
        zkr5Btns = mv.findViewById(R.id.zikir5Btns);
        zkr6Btns = mv.findViewById(R.id.zikir6Btns);
        zkr7Btns = mv.findViewById(R.id.zikir7Btns);
        zkr8Btns = mv.findViewById(R.id.zikir8Btns);
        zkr9Btns = mv.findViewById(R.id.zikir9Btns);
        zkr10Btns = mv.findViewById(R.id.zikir10Btns);


        zkr1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckSound(1);
            }
        });

        zkr2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckSound(2);
            }
        });

        zkr3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckSound(3);
            }
        });
        zkr4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckSound(4);
            }
        });
        zkr5Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckSound(5);
            }
        });
        zkr6Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckSound(6);
            }
        });
        zkr7Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckSound(7);
            }
        });
        zkr8Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckSound(8);
            }
        });
        zkr9Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckSound(9);
            }
        });
        zkr10Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckSound(10);
            }
        });

        zkr1Btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pausePlayer();
            }
        });

        zkr2Btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pausePlayer();
            }
        });

        zkr3Btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pausePlayer();
            }
        });
        zkr4Btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pausePlayer();
            }
        });
        zkr5Btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pausePlayer();
            }
        });
        zkr6Btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pausePlayer();
            }
        });
        zkr7Btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pausePlayer();
            }
        });
        zkr8Btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pausePlayer();
            }
        });
        zkr9Btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pausePlayer();
            }
        });
        zkr10Btns.setOnClickListener(new View.OnClickListener() {
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
                play = MediaPlayer.create(getActivity(), R.raw.zikir1);
                break;
            case 2:
                play = MediaPlayer.create(getActivity(), R.raw.zikir2);
                break;
            case 3:
                play = MediaPlayer.create(getActivity(), R.raw.zikir3);
                break;
            case 4:
                play = MediaPlayer.create(getActivity(), R.raw.zikir4);
                break;
            case 5:
                play = MediaPlayer.create(getActivity(), R.raw.zikir5);
                break;
            case 6:
                play = MediaPlayer.create(getActivity(), R.raw.zikir6);
                break;
            case 7:
                play = MediaPlayer.create(getActivity(), R.raw.zikir7);
                break;
            case 8:
                play = MediaPlayer.create(getActivity(), R.raw.zikir8);
                break;
            case 9:
                play = MediaPlayer.create(getActivity(), R.raw.zikir9);
                break;
            case 10:
                play = MediaPlayer.create(getActivity(), R.raw.zikir10);
                break;
            default:
                break;
        }

        return play;
    }
}
