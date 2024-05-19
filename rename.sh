#!/bin/bash

# for dir in */ ; do
#     cd "$dir"
#     for file in Question*.java ; do
#         num=${file#Question}
#         num=${num%.java}
#         mv "$file" "${dir%/}_q${num}.java"
#     done
#     cd ..
# done

#!/bin/bash

for dir in */ ; do
    cd "$dir"
    for file in ${dir%/}_q*.java ; do
        # Extract the new class name from the filename
        new_class_name=${file%.java}

        # Extract the original question number
        original_question_number=${file#*_q}
        original_question_number=${original_question_number%.java}

        # Use sed to replace the old class name with the new class name
        sed -i "s/Question${original_question_number}/$new_class_name/g" "$file"
    done
    cd ..
done