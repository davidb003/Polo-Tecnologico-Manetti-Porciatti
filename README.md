# Polo-Tecnologico-Manetti-Porciatti
Allor, praticamente te gh'è l'indirisso de na' rete chel'scominsia per 192.168.0.0

In sto'ndirisso ghe s'è na' parte de rete (192.168.0 → /24 bit) e na' parte de host (.0 → 255h)

Se ti te voj spessar' sta' rete in modo da ragrupar' solo quei host che i sentra tra de lori, non te gh'è altro da far che tojere dei bit a sinistra alla parte di host (00000000) e dedicargheli ad una nuova parte ciamà subnet ([00 → 4 subnet] + [000000 → 63 host a subnet])

Infine, non te gh'è da far che metar l'indirisso de subnet mask giusto per i vari router o per tuti ji' host (255.255.255.192 → -.11000000)
