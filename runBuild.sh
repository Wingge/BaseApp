#!/bin/bash
if [ $1 = "1" ]
    then echo "build Release"
    ./gradlew assembleRelease
	elif [ $1 = "2" ]
	./gradlew assembleGoogleplayQualityassurance
	then echo "build qualityassurance"
	elif [ $1 = "3" ]
	then echo "build debug"
	./gradlew assembleGoogleplayDebug
	else
	echo "build $1"
	./gradlew $1
fi

#./runShare2All.sh