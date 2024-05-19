#!/bin/bash

for dir in */ ; do
    cd "$dir"
    for file in Question*.java ; do
        num=${file#Question}
        num=${num%.java}
        mv "$file" "${dir%/}_q${num}.java"
    done
    cd ..
done