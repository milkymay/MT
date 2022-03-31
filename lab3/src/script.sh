# shellcheck disable=SC2164
cd C:\\Users\\melis\\Desktop\\MT\\lab3\\src\\main\\java
printf "\ntesting...\n\n"
for (( i = 0; i < 4; i++ ))
do
output_test=$(java tests\\test"$i".java)
output_processed=$(java outs\\test"$i".java)
if [ "$output_test" == "$output_processed" ]
then
echo "test" "$i" "succeeded"
else
echo "something went wrong: ""$output_processed"
echo "expected:" "$output_test"
echo "but got:" "$output_processed"
fi
done
printf "\ntesting finished\n"