class Solution:
    def numUniqueEmails(self, emails):
        unique_emails = set()

        for email in emails:
            local, domain = email.split('@')
            # Remove everything after '+'
            local = local.split('+')[0]
            # Remove all dots in the local part
            local = local.replace('.', '')
            # Recombine the local and domain parts
            unique_emails.add(local + '@' + domain)

        return len(unique_emails)
