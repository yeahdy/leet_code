class Solution(object):
    def removeDuplicates(self, s):
        slist = [0]


        for i in range(len(s)) :
            slist.append(s[i])
            if slist[-2]==slist[-1] :	
                del slist[-2:]

        del slist[0]
        return("".join(slist))
