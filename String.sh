name="sahil"
name1="Gautam"
name2="BMW"


names=${name}%${name1}%${name2}
names="$name" "$name1" "$name2"
echo ${#name}
echo $names