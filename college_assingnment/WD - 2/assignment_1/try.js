let b=[];
let a="GAUtam"
for(let i=0;i<a.length;i++)
{
    if(a[i]>="A" && a[i]<="Z")
    {
         b[i]=a[i].toLowerCase();
    }
    else
    {
        b[i]=a[i].toUpperCase();
    }
}
c=b.join("")
console.log(c);
