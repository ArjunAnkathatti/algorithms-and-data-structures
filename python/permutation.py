#!bin/python
count = 0;
def per(str, pre):
	global count
	print("prefix: " + pre)
	if len(str) == 0:
		print(pre)
		count += 1
	else:
		for i in range(len(str)):
			rem = str[:i] + str[i+1:]
			pre += str[i]

			per(rem, pre)

s = "abc"
per(s, "")
print(count)
