def Number_Reader(filename):
	nums = []
	F = open(filename, 'r')
	for x in F:
		count=0
		length=len(x)
		while count<length:
			num=""
			if(x[count].isdigit()):
				num = x[count]
				while x[count+1].isdigit()==True:
					num+=x[count+1]
					count+=1
			if(num!=""):
				nums.append(num)
			count+=1
	F.close()
	print(nums)

Number_Reader("Text.txt")
